// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.unknownfields.VersionOne in unknown_fields.proto
package com.squareup.wire.protos.unknownfields;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class VersionOne extends Message<VersionOne, VersionOne.Builder> {
  public static final ProtoAdapter<VersionOne> ADAPTER = new ProtoAdapter_VersionOne();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  public static final EnumVersionOne DEFAULT_EN = EnumVersionOne.SHREK_V1;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer i;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.protos.unknownfields.NestedVersionOne#ADAPTER"
  )
  public final NestedVersionOne obj;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.protos.unknownfields.EnumVersionOne#ADAPTER"
  )
  public final EnumVersionOne en;

  public VersionOne(Integer i, NestedVersionOne obj, EnumVersionOne en) {
    this(i, obj, en, ByteString.EMPTY);
  }

  public VersionOne(Integer i, NestedVersionOne obj, EnumVersionOne en, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.i = i;
    this.obj = obj;
    this.en = en;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.i = i;
    builder.obj = obj;
    builder.en = en;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VersionOne)) return false;
    VersionOne o = (VersionOne) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(i, o.i)
        && Internal.equals(obj, o.obj)
        && Internal.equals(en, o.en);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (i != null ? i.hashCode() : 0);
      result = result * 37 + (obj != null ? obj.hashCode() : 0);
      result = result * 37 + (en != null ? en.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (i != null) builder.append(", i=").append(i);
    if (obj != null) builder.append(", obj=").append(obj);
    if (en != null) builder.append(", en=").append(en);
    return builder.replace(0, 2, "VersionOne{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VersionOne, Builder> {
    public Integer i;

    public NestedVersionOne obj;

    public EnumVersionOne en;

    public Builder() {
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    public Builder obj(NestedVersionOne obj) {
      this.obj = obj;
      return this;
    }

    public Builder en(EnumVersionOne en) {
      this.en = en;
      return this;
    }

    @Override
    public VersionOne build() {
      return new VersionOne(i, obj, en, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VersionOne extends ProtoAdapter<VersionOne> {
    public ProtoAdapter_VersionOne() {
      super(FieldEncoding.LENGTH_DELIMITED, VersionOne.class, "type.googleapis.com/squareup.protos.unknownfields.VersionOne", Syntax.PROTO_2, null);
    }

    @Override
    public int encodedSize(VersionOne value) {
      int result = 0;
      result += ProtoAdapter.INT32.encodedSizeWithTag(1, value.i);
      result += NestedVersionOne.ADAPTER.encodedSizeWithTag(7, value.obj);
      result += EnumVersionOne.ADAPTER.encodedSizeWithTag(8, value.en);
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, VersionOne value) throws IOException {
      ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i);
      NestedVersionOne.ADAPTER.encodeWithTag(writer, 7, value.obj);
      EnumVersionOne.ADAPTER.encodeWithTag(writer, 8, value.en);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public VersionOne decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.i(ProtoAdapter.INT32.decode(reader)); break;
          case 7: builder.obj(NestedVersionOne.ADAPTER.decode(reader)); break;
          case 8: {
            try {
              builder.en(EnumVersionOne.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public VersionOne redact(VersionOne value) {
      Builder builder = value.newBuilder();
      if (builder.obj != null) builder.obj = NestedVersionOne.ADAPTER.redact(builder.obj);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
