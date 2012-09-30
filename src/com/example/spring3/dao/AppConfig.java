package com.example.spring3.dao;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.DomaAbstractConfig;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionalDataSource;

public class AppConfig extends DomaAbstractConfig {

	protected static final LocalTransactionalDataSource dataSource = createDataSource();
	protected static final Dialect dialect = new PostgresDialect();

	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public Dialect getDialect() {
		return dialect;
	}

	protected static LocalTransactionalDataSource createDataSource() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		SimpleDataSource dataSource = new SimpleDataSource();
		dataSource.setUrl("jdbc:postgresql:testdb");
		dataSource.setUser("postgres");
		dataSource.setPassword("password");
		return new LocalTransactionalDataSource(dataSource);
	}

	public static LocalTransaction getLocalTransaction() {
		return dataSource.getLocalTransaction(defaultJdbcLogger);
	}

}