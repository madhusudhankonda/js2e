package com.madhusudhan.jscore.basics.readers;

import javax.sql.DataSource;

/**
 * Dummy implementation of DatabaseReader
 * 
 * @author kondama
 * 
 */
public class DatabaseReader implements IReader {

  private DataSource dataSource = null;

  /**
   * Override with data fetch functionality
   */
  @Override
  public String read() {
      // implement this method to read from DB
    return null;
  }

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public DataSource getDataSource() {
    return dataSource;
  }

}
