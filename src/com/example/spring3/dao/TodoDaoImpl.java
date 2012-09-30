package com.example.spring3.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.20.0" }, date = "2012-02-10T19:48:00.812+0900")
public class TodoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.example.spring3.dao.TodoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.20.0");
    }

    /** */
    public TodoDaoImpl() {
        super(new com.example.spring3.dao.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public TodoDaoImpl(java.sql.Connection connection) {
        super(new com.example.spring3.dao.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public TodoDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.example.spring3.dao.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected TodoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected TodoDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected TodoDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(com.example.spring3.dao.Todo _todo) {
        entering("com.example.spring3.dao.TodoDaoImpl", "delete", _todo);
        try {
            if (_todo == null) {
                throw new org.seasar.doma.DomaNullPointerException("_todo");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.example.spring3.dao.Todo> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.example.spring3.dao.Todo>(com.example.spring3.dao._Todo.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(_todo);
            __query.setCallerClassName("com.example.spring3.dao.TodoDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.example.spring3.dao.TodoDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.spring3.dao.TodoDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.example.spring3.dao.Todo _todo) {
        entering("com.example.spring3.dao.TodoDaoImpl", "insert", _todo);
        try {
            if (_todo == null) {
                throw new org.seasar.doma.DomaNullPointerException("_todo");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.example.spring3.dao.Todo> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.example.spring3.dao.Todo>(com.example.spring3.dao._Todo.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(_todo);
            __query.setCallerClassName("com.example.spring3.dao.TodoDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.example.spring3.dao.TodoDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.spring3.dao.TodoDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.example.spring3.dao.Todo> selectAll() {
        entering("com.example.spring3.dao.TodoDaoImpl", "selectAll");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/example/spring3/dao/TodoDao/selectAll.sql");
            __query.setCallerClassName("com.example.spring3.dao.TodoDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.example.spring3.dao.Todo>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.example.spring3.dao.Todo>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.spring3.dao.Todo>(com.example.spring3.dao._Todo.getSingletonInternal()));
            java.util.List<com.example.spring3.dao.Todo> __result = __command.execute();
            __query.complete();
            exiting("com.example.spring3.dao.TodoDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.spring3.dao.TodoDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public com.example.spring3.dao.Todo selectById(java.lang.Integer id) {
        entering("com.example.spring3.dao.TodoDaoImpl", "selectById", id);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/example/spring3/dao/TodoDao/selectById.sql");
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("com.example.spring3.dao.TodoDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.example.spring3.dao.Todo> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.example.spring3.dao.Todo>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.example.spring3.dao.Todo>(com.example.spring3.dao._Todo.getSingletonInternal()));
            com.example.spring3.dao.Todo __result = __command.execute();
            __query.complete();
            exiting("com.example.spring3.dao.TodoDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.spring3.dao.TodoDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.example.spring3.dao.Todo _todo) {
        entering("com.example.spring3.dao.TodoDaoImpl", "update", _todo);
        try {
            if (_todo == null) {
                throw new org.seasar.doma.DomaNullPointerException("_todo");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.example.spring3.dao.Todo> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.example.spring3.dao.Todo>(com.example.spring3.dao._Todo.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(_todo);
            __query.setCallerClassName("com.example.spring3.dao.TodoDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.example.spring3.dao.TodoDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.spring3.dao.TodoDaoImpl", "update", __e);
            throw __e;
        }
    }

}
