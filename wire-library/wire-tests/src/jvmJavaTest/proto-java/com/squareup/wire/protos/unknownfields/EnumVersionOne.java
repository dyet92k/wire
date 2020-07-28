// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.unknownfields.EnumVersionOne in unknown_fields.proto
package com.squareup.wire.protos.unknownfields;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.lang.Override;

public enum EnumVersionOne implements WireEnum {
  SHREK_V1(1),

  DONKEY_V1(2),

  FIONA_V1(3);

  public static final ProtoAdapter<EnumVersionOne> ADAPTER = new ProtoAdapter_EnumVersionOne();

  private final int value;

  EnumVersionOne(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static EnumVersionOne fromValue(int value) {
    switch (value) {
      case 1: return SHREK_V1;
      case 2: return DONKEY_V1;
      case 3: return FIONA_V1;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }

  private static final class ProtoAdapter_EnumVersionOne extends EnumAdapter<EnumVersionOne> {
    ProtoAdapter_EnumVersionOne() {
      super(EnumVersionOne.class, Syntax.PROTO_2, null);
    }

    @Override
    protected EnumVersionOne fromValue(int value) {
      return EnumVersionOne.fromValue(value);
    }
  }
}
