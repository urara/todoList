package com.example.spring3.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.20.0" }, date = "2012-02-10T19:48:38.140+0900")
public final class _Todo extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.spring3.dao.Todo> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.20.0");
    }

    private static final _Todo __singleton = new _Todo();

    /** the Contents */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.lang.String, java.lang.Object> Contents = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.lang.String, java.lang.Object>(com.example.spring3.dao.Todo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "Contents", "CONTENTS", true, true);

    /** the Date */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.sql.Date, java.lang.Object> Date = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.sql.Date, java.lang.Object>(com.example.spring3.dao.Todo.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "Date", "DATE", true, true);

    /** the Emergency */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.lang.Integer, java.lang.Object> Emergency = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.lang.Integer, java.lang.Object>(com.example.spring3.dao.Todo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "Emergency", "EMERGENCY", true, true);

    /** the Id */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.lang.Integer, java.lang.Object> Id = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.lang.Integer, java.lang.Object>(com.example.spring3.dao.Todo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "Id", "ID");

    /** the Version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.lang.Integer, java.lang.Object> Version = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.example.spring3.dao.Todo, java.lang.Integer, java.lang.Object>(com.example.spring3.dao.Todo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "Version", "VERSION");

    private final org.seasar.doma.jdbc.entity.NullEntityListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>> __entityPropertyTypeMap;

    private _Todo() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __name = "Todo";
        __catalogName = "";
        __schemaName = "";
        __tableName = "TODO";
        __qualifiedTableName = "TODO";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>>(5);
        __list.add(Contents);
        __map.put("Contents", Contents);
        __list.add(Date);
        __map.put("Date", Date);
        __list.add(Emergency);
        __map.put("Emergency", Emergency);
        __idList.add(Id);
        __list.add(Id);
        __map.put("Id", Id);
        __list.add(Version);
        __map.put("Version", Version);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(com.example.spring3.dao.Todo entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.example.spring3.dao.Todo entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.example.spring3.dao.Todo entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.example.spring3.dao.Todo entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.example.spring3.dao.Todo entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.example.spring3.dao.Todo entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.spring3.dao.Todo, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.example.spring3.dao.Todo, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.example.spring3.dao.Todo, ?, ?> getVersionPropertyType() {
        return Version;
    }

    @Override
    public com.example.spring3.dao.Todo newEntity() {
        return new com.example.spring3.dao.Todo();
    }

    @Override
    public Class<com.example.spring3.dao.Todo> getEntityClass() {
        return com.example.spring3.dao.Todo.class;
    }

    @Override
    public com.example.spring3.dao.Todo getOriginalStates(com.example.spring3.dao.Todo __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.spring3.dao.Todo __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Todo getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Todo newInstance() {
        return new _Todo();
    }

}
