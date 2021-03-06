// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.MethodOptions in google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.internal.redactElements
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

class MethodOptions(
  /**
   * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
   *   framework.  We apologize for hoarding these numbers to ourselves, but
   *   we were already using them long before we decided to release Protocol
   *   Buffers.
   * Is this method deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the method, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating methods.
   */
  @field:WireField(
    tag = 33,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  val deprecated: Boolean? = null,
  @field:WireField(
    tag = 34,
    adapter = "com.google.protobuf.MethodOptions${'$'}IdempotencyLevel#ADAPTER"
  )
  val idempotency_level: IdempotencyLevel? = null,
  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY
) : Message<MethodOptions, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing = throw AssertionError()

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MethodOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (deprecated != other.deprecated) return false
    if (idempotency_level != other.idempotency_level) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + deprecated.hashCode()
      result = result * 37 + idempotency_level.hashCode()
      result = result * 37 + uninterpreted_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (idempotency_level != null) result += """idempotency_level=$idempotency_level"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    return result.joinToString(prefix = "MethodOptions{", separator = ", ", postfix = "}")
  }

  fun copy(
    deprecated: Boolean? = this.deprecated,
    idempotency_level: IdempotencyLevel? = this.idempotency_level,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    unknownFields: ByteString = this.unknownFields
  ): MethodOptions = MethodOptions(deprecated, idempotency_level, uninterpreted_option,
      unknownFields)

  companion object {
    const val DEFAULT_DEPRECATED: Boolean = false

    @JvmField
    val DEFAULT_IDEMPOTENCY_LEVEL: IdempotencyLevel = IdempotencyLevel.IDEMPOTENCY_UNKNOWN

    @JvmField
    val ADAPTER: ProtoAdapter<MethodOptions> = object : ProtoAdapter<MethodOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      MethodOptions::class, 
      "type.googleapis.com/google.protobuf.MethodOptions", 
      PROTO_2
    ) {
      override fun encodedSize(value: MethodOptions): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BOOL.encodedSizeWithTag(33, value.deprecated)
        size += IdempotencyLevel.ADAPTER.encodedSizeWithTag(34, value.idempotency_level)
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        return size
      }

      override fun encode(writer: ProtoWriter, value: MethodOptions) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 33, value.deprecated)
        IdempotencyLevel.ADAPTER.encodeWithTag(writer, 34, value.idempotency_level)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MethodOptions {
        var deprecated: Boolean? = null
        var idempotency_level: IdempotencyLevel? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            33 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            34 -> try {
              idempotency_level = IdempotencyLevel.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return MethodOptions(
          deprecated = deprecated,
          idempotency_level = idempotency_level,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MethodOptions): MethodOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }

  /**
   * Is this method side-effect-free (or safe in HTTP parlance), or idempotent,
   * or neither? HTTP based RPC implementation may choose GET verb for safe
   * methods, and PUT verb for idempotent methods instead of the default POST.
   */
  enum class IdempotencyLevel(
    override val value: Int
  ) : WireEnum {
    IDEMPOTENCY_UNKNOWN(0),

    /**
     * implies idempotent
     */
    NO_SIDE_EFFECTS(1),

    /**
     * idempotent, but may have side effects
     */
    IDEMPOTENT(2);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<IdempotencyLevel> = object : EnumAdapter<IdempotencyLevel>(
        IdempotencyLevel::class, 
        PROTO_2
      ) {
        override fun fromValue(value: Int): IdempotencyLevel? = IdempotencyLevel.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): IdempotencyLevel? = when (value) {
        0 -> IDEMPOTENCY_UNKNOWN
        1 -> NO_SIDE_EFFECTS
        2 -> IDEMPOTENT
        else -> null
      }
    }
  }
}
