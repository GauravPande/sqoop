/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.connector.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Collection;

import org.apache.sqoop.common.MutableContext;
import org.apache.sqoop.common.MutableMapContext;
import org.apache.sqoop.connector.jdbc.configuration.ConnectionConfiguration;
import org.apache.sqoop.connector.jdbc.configuration.ExportJobConfiguration;
import org.apache.sqoop.etl.io.DataReader;
import org.apache.sqoop.job.etl.Loader;
import org.apache.sqoop.job.etl.LoaderContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestExportLoader {

//  private final String tableName;
//
//  private GenericJdbcExecutor executor;
//
//  private static final int START = -50;
//
//  private int numberOfRows;
//
//  @Parameters
//  public static Collection<Object[]> data() {
//    return Arrays.asList(new Object[][] {{50}, {100}, {101}, {150}, {200}});
//  }
//
//  public TestExportLoader(int numberOfRows) {
//    this.numberOfRows = numberOfRows;
//    tableName = getClass().getSimpleName().toUpperCase();
//  }
//
//  @Before
//  public void setUp() {
//    executor = new GenericJdbcExecutor(GenericJdbcTestConstants.DRIVER,
//        GenericJdbcTestConstants.URL, null, null);
//
//    if (!executor.existTable(tableName)) {
//      executor.executeUpdate("CREATE TABLE "
//          + executor.delimitIdentifier(tableName)
//          + "(ICOL INTEGER PRIMARY KEY, DCOL DOUBLE, VCOL VARCHAR(20))");
//    } else {
//      executor.deleteTableData(tableName);
//    }
//  }
//
//  @After
//  public void tearDown() {
//    executor.close();
//  }
//
//  @Test
//  public void testInsert() throws Exception {
//    MutableContext context = new MutableMapContext();
//
//    ConnectionConfiguration connectionConfig = new ConnectionConfiguration();
//
//    connectionConfig.connection.jdbcDriver = GenericJdbcTestConstants.DRIVER;
//    connectionConfig.connection.connectionString = GenericJdbcTestConstants.URL;
//
//    ExportJobConfiguration jobConfig = new ExportJobConfiguration();
//
//    context.setString(GenericJdbcConnectorConstants.CONNECTOR_JDBC_DATA_SQL,
//        "INSERT INTO " + executor.delimitIdentifier(tableName) + " VALUES (?,?,?)");
//
//    Loader loader = new GenericJdbcExportLoader();
//    DummyReader reader = new DummyReader();
//    LoaderContext loaderContext = new LoaderContext(context, reader, null);
//    loader.load(loaderContext, connectionConfig, jobConfig);
//
//    int index = START;
//    ResultSet rs = executor.executeQuery("SELECT * FROM "
//        + executor.delimitIdentifier(tableName) + " ORDER BY ICOL");
//    while (rs.next()) {
//      assertEquals(index, rs.getObject(1));
//      assertEquals((double) index, rs.getObject(2));
//      assertEquals(String.valueOf(index), rs.getObject(3));
//      index++;
//    }
//    assertEquals(numberOfRows, index-START);
//  }
//
//  public class DummyReader extends DataReader {
//    int index = 0;
//
//    @Override
//    public void setFieldDelimiter(char fieldDelimiter) {
//      // do nothing and use default delimiter
//    }
//
//    @Override
//    public Object[] readArrayRecord() {
//      if (index < numberOfRows) {
//        Object[] array = new Object[] {
//            START + index,
//            (double) (START + index),
//            String.valueOf(START+index) };
//        index++;
//        return array;
//      } else {
//        return null;
//      }
//    }
//
//    @Override
//    public String readCsvRecord() {
//      fail("This method should not be invoked.");
//      return null;
//    }
//
//    @Override
//    public Object readContent(int type) {
//      fail("This method should not be invoked.");
//      return null;
//    }
//  }

}
