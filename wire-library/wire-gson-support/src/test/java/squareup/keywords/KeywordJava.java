// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: keyword_java.proto
package squareup.keywords;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class KeywordJava extends Message<KeywordJava, KeywordJava.Builder> {
  public static final ProtoAdapter<KeywordJava> ADAPTER = new ProtoAdapter_KeywordJava();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_FINAL_ = "";

  public static final Boolean DEFAULT_PUBLIC_ = false;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      declaredName = "final"
  )
  public final String final_;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL",
      label = WireField.Label.REQUIRED,
      declaredName = "public"
  )
  public final Boolean public_;

  @WireField(
      tag = 3,
      keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      declaredName = "package"
  )
  public final Map<String, String> package_;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL",
      label = WireField.Label.REPEATED,
      declaredName = "return"
  )
  public final List<Boolean> return_;

  public KeywordJava(String final_, Boolean public_, Map<String, String> package_,
      List<Boolean> return_) {
    this(final_, public_, package_, return_, ByteString.EMPTY);
  }

  public KeywordJava(String final_, Boolean public_, Map<String, String> package_,
      List<Boolean> return_, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.final_ = final_;
    this.public_ = public_;
    this.package_ = Internal.immutableCopyOf("package_", package_);
    this.return_ = Internal.immutableCopyOf("return_", return_);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.final_ = final_;
    builder.public_ = public_;
    builder.package_ = Internal.copyOf(package_);
    builder.return_ = Internal.copyOf(return_);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof KeywordJava)) return false;
    KeywordJava o = (KeywordJava) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(final_, o.final_)
        && public_.equals(o.public_)
        && package_.equals(o.package_)
        && return_.equals(o.return_);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (final_ != null ? final_.hashCode() : 0);
      result = result * 37 + public_.hashCode();
      result = result * 37 + package_.hashCode();
      result = result * 37 + return_.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (final_ != null) builder.append(", final=").append(Internal.sanitize(final_));
    builder.append(", public=").append(public_);
    if (!package_.isEmpty()) builder.append(", package=").append(package_);
    if (!return_.isEmpty()) builder.append(", return=").append(return_);
    return builder.replace(0, 2, "KeywordJava{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<KeywordJava, Builder> {
    public String final_;

    public Boolean public_;

    public Map<String, String> package_;

    public List<Boolean> return_;

    public Builder() {
      package_ = Internal.newMutableMap();
      return_ = Internal.newMutableList();
    }

    public Builder final_(String final_) {
      this.final_ = final_;
      return this;
    }

    public Builder public_(Boolean public_) {
      this.public_ = public_;
      return this;
    }

    public Builder package_(Map<String, String> package_) {
      Internal.checkElementsNotNull(package_);
      this.package_ = package_;
      return this;
    }

    public Builder return_(List<Boolean> return_) {
      Internal.checkElementsNotNull(return_);
      this.return_ = return_;
      return this;
    }

    @Override
    public KeywordJava build() {
      if (public_ == null) {
        throw Internal.missingRequiredFields(public_, "public");
      }
      return new KeywordJava(final_, public_, package_, return_, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_KeywordJava extends ProtoAdapter<KeywordJava> {
    private ProtoAdapter<Map<String, String>> package_;

    public ProtoAdapter_KeywordJava() {
      super(FieldEncoding.LENGTH_DELIMITED, KeywordJava.class, "type.googleapis.com/squareup.keywords.KeywordJava", Syntax.PROTO_2);
    }

    @Override
    public int encodedSize(KeywordJava value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.final_)
          + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.public_)
          + package_Adapter().encodedSizeWithTag(3, value.package_)
          + ProtoAdapter.BOOL.asRepeated().encodedSizeWithTag(4, value.return_)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, KeywordJava value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.final_);
      ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.public_);
      package_Adapter().encodeWithTag(writer, 3, value.package_);
      ProtoAdapter.BOOL.asRepeated().encodeWithTag(writer, 4, value.return_);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public KeywordJava decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.final_(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.public_(ProtoAdapter.BOOL.decode(reader)); break;
          case 3: builder.package_.putAll(package_Adapter().decode(reader)); break;
          case 4: builder.return_.add(ProtoAdapter.BOOL.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public KeywordJava redact(KeywordJava value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }

    private ProtoAdapter<Map<String, String>> package_Adapter() {
      ProtoAdapter<Map<String, String>> result = package_;
      if (result == null) {
        result = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);
        package_ = result;
      }
      return result;
    }
  }
}