// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos.proto

package com.hubspot.rosetta.beans;

public final class Protos {
  private Protos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TemplateOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 id = 1;
    boolean hasId();
    int getId();
    
    // optional int32 owner_id = 2;
    boolean hasOwnerId();
    int getOwnerId();
    
    // optional int32 portal_id = 3;
    boolean hasPortalId();
    int getPortalId();
    
    // optional string name = 4;
    boolean hasName();
    String getName();
    
    // optional string body = 5;
    boolean hasBody();
    String getBody();
    
    // optional bool is_private = 6;
    boolean hasIsPrivate();
    boolean getIsPrivate();
  }
  public static final class Template extends
      com.google.protobuf.GeneratedMessage
      implements TemplateOrBuilder {
    // Use Template.newBuilder() to construct.
    private Template(Builder builder) {
      super(builder);
    }
    private Template(boolean noInit) {}
    
    private static final Template defaultInstance;
    public static Template getDefaultInstance() {
      return defaultInstance;
    }
    
    public Template getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hubspot.rosetta.beans.Protos.internal_static_com_hubspot_rosetta_beans_Template_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hubspot.rosetta.beans.Protos.internal_static_com_hubspot_rosetta_beans_Template_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getId() {
      return id_;
    }
    
    // optional int32 owner_id = 2;
    public static final int OWNER_ID_FIELD_NUMBER = 2;
    private int ownerId_;
    public boolean hasOwnerId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOwnerId() {
      return ownerId_;
    }
    
    // optional int32 portal_id = 3;
    public static final int PORTAL_ID_FIELD_NUMBER = 3;
    private int portalId_;
    public boolean hasPortalId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getPortalId() {
      return portalId_;
    }
    
    // optional string name = 4;
    public static final int NAME_FIELD_NUMBER = 4;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string body = 5;
    public static final int BODY_FIELD_NUMBER = 5;
    private java.lang.Object body_;
    public boolean hasBody() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getBody() {
      java.lang.Object ref = body_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          body_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getBodyBytes() {
      java.lang.Object ref = body_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional bool is_private = 6;
    public static final int IS_PRIVATE_FIELD_NUMBER = 6;
    private boolean isPrivate_;
    public boolean hasIsPrivate() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public boolean getIsPrivate() {
      return isPrivate_;
    }
    
    private void initFields() {
      id_ = 0;
      ownerId_ = 0;
      portalId_ = 0;
      name_ = "";
      body_ = "";
      isPrivate_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, ownerId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, portalId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getBodyBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, isPrivate_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, ownerId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, portalId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getNameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getBodyBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isPrivate_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.hubspot.rosetta.beans.Protos.Template parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hubspot.rosetta.beans.Protos.Template parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hubspot.rosetta.beans.Protos.Template prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.hubspot.rosetta.beans.Protos.TemplateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hubspot.rosetta.beans.Protos.internal_static_com_hubspot_rosetta_beans_Template_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hubspot.rosetta.beans.Protos.internal_static_com_hubspot_rosetta_beans_Template_fieldAccessorTable;
      }
      
      // Construct using com.hubspot.rosetta.beans.Protos.Template.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        ownerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        portalId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        body_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        isPrivate_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hubspot.rosetta.beans.Protos.Template.getDescriptor();
      }
      
      public com.hubspot.rosetta.beans.Protos.Template getDefaultInstanceForType() {
        return com.hubspot.rosetta.beans.Protos.Template.getDefaultInstance();
      }
      
      public com.hubspot.rosetta.beans.Protos.Template build() {
        com.hubspot.rosetta.beans.Protos.Template result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hubspot.rosetta.beans.Protos.Template buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hubspot.rosetta.beans.Protos.Template result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hubspot.rosetta.beans.Protos.Template buildPartial() {
        com.hubspot.rosetta.beans.Protos.Template result = new com.hubspot.rosetta.beans.Protos.Template(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.ownerId_ = ownerId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.portalId_ = portalId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.body_ = body_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.isPrivate_ = isPrivate_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hubspot.rosetta.beans.Protos.Template) {
          return mergeFrom((com.hubspot.rosetta.beans.Protos.Template)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hubspot.rosetta.beans.Protos.Template other) {
        if (other == com.hubspot.rosetta.beans.Protos.Template.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasOwnerId()) {
          setOwnerId(other.getOwnerId());
        }
        if (other.hasPortalId()) {
          setPortalId(other.getPortalId());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasBody()) {
          setBody(other.getBody());
        }
        if (other.hasIsPrivate()) {
          setIsPrivate(other.getIsPrivate());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              ownerId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              portalId_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              name_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              body_ = input.readBytes();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              isPrivate_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 id = 1;
      private int id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getId() {
        return id_;
      }
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 owner_id = 2;
      private int ownerId_ ;
      public boolean hasOwnerId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOwnerId() {
        return ownerId_;
      }
      public Builder setOwnerId(int value) {
        bitField0_ |= 0x00000002;
        ownerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOwnerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ownerId_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 portal_id = 3;
      private int portalId_ ;
      public boolean hasPortalId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getPortalId() {
        return portalId_;
      }
      public Builder setPortalId(int value) {
        bitField0_ |= 0x00000004;
        portalId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPortalId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        portalId_ = 0;
        onChanged();
        return this;
      }
      
      // optional string name = 4;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
      }
      
      // optional string body = 5;
      private java.lang.Object body_ = "";
      public boolean hasBody() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getBody() {
        java.lang.Object ref = body_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          body_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setBody(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        body_ = value;
        onChanged();
        return this;
      }
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~0x00000010);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      void setBody(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        body_ = value;
        onChanged();
      }
      
      // optional bool is_private = 6;
      private boolean isPrivate_ ;
      public boolean hasIsPrivate() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public boolean getIsPrivate() {
        return isPrivate_;
      }
      public Builder setIsPrivate(boolean value) {
        bitField0_ |= 0x00000020;
        isPrivate_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsPrivate() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isPrivate_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hubspot.rosetta.beans.Template)
    }
    
    static {
      defaultInstance = new Template(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hubspot.rosetta.beans.Template)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hubspot_rosetta_beans_Template_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hubspot_rosetta_beans_Template_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014protos.proto\022\031com.hubspot.rosetta.bean" +
      "s\"k\n\010Template\022\n\n\002id\030\001 \001(\005\022\020\n\010owner_id\030\002 " +
      "\001(\005\022\021\n\tportal_id\030\003 \001(\005\022\014\n\004name\030\004 \001(\t\022\014\n\004" +
      "body\030\005 \001(\t\022\022\n\nis_private\030\006 \001(\010"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_hubspot_rosetta_beans_Template_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_hubspot_rosetta_beans_Template_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hubspot_rosetta_beans_Template_descriptor,
              new java.lang.String[] { "Id", "OwnerId", "PortalId", "Name", "Body", "IsPrivate", },
              com.hubspot.rosetta.beans.Protos.Template.class,
              com.hubspot.rosetta.beans.Protos.Template.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}