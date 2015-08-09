/*
 * File created on Aug 8, 2015
 *
 * Copyright (c) 2015 Carl Harris, Jr
 * and others as noted
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.soulwing.sql;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * A closure that extracts a single object result from a {@link ResultSet}.
 * <p>
 * This interface provides the means for an {@link SQLTemplate} query invocation
 * to process the result set in an arbitrary fashion.
 * <p>
 * While the {@link #extract(ResultSet)} method can return a value, it is not
 * always necessary.  When an implementation does not need to return a value,
 * simple use {@link Void} as the type parameter.
 *
 * @param <T> the type of result returned by this extractor
 * @author Carl Harris
 */
public interface ResultSetExtractor<T> {

  /**
   * Extracts a single object result from a result set.
   * @param rs the result set to process
   * @return any value of type {@code T}
   * @throws SQLException as needed
   */
  T extract(ResultSet rs) throws SQLException;

}
