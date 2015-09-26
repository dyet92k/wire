// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/simple_message.proto
package com.squareup.wire.protos.simple;

import com.squareup.wire.Extension;
import com.squareup.wire.WireField;
import com.squareup.wire.protos.foreign.ForeignMessage;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;

public final class Ext_simple_message {
  public static final Extension<ExternalMessage, List<Integer>> fooext = Extension.get(ExternalMessage.class,
      WireField.Label.REPEATED,
      "squareup.protos.simple.fooext",
      125,
      "com.squareup.wire.ProtoAdapter#INT32");

  public static final Extension<ExternalMessage, Integer> barext = Extension.get(ExternalMessage.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.simple.barext",
      126,
      "com.squareup.wire.ProtoAdapter#INT32");

  public static final Extension<ExternalMessage, Integer> bazext = Extension.get(ExternalMessage.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.simple.bazext",
      127,
      "com.squareup.wire.ProtoAdapter#INT32");

  public static final Extension<ExternalMessage, SimpleMessage.NestedMessage> nested_message_ext = Extension.get(ExternalMessage.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.simple.nested_message_ext",
      128,
      "com.squareup.wire.protos.simple.SimpleMessage$NestedMessage#ADAPTER");

  public static final Extension<ExternalMessage, SimpleMessage.NestedEnum> nested_enum_ext = Extension.get(ExternalMessage.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.simple.nested_enum_ext",
      129,
      "com.squareup.wire.protos.simple.SimpleMessage$NestedEnum#ADAPTER");

  public static final Extension<ForeignMessage, Integer> j = Extension.get(ForeignMessage.class,
      WireField.Label.OPTIONAL,
      "squareup.protos.simple.j",
      100,
      "com.squareup.wire.ProtoAdapter#INT32");

  public static final List<Extension<?, ?>> EXTENSIONS = Arrays.<Extension<?, ?>>asList(
      fooext,
      barext,
      bazext,
      nested_message_ext,
      nested_enum_ext,
      j);

  private Ext_simple_message() {
  }
}