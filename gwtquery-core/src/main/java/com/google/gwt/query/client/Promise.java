/*
 * Copyright 2013, The gwtquery team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.query.client;

import com.google.gwt.query.client.Function;

/**
 * Definition of jquery Promise interface used in gquery. 
 */
public interface Promise {

  public static final String PENDING = "pending";
  public static final String REJECTED = "rejected";
  public static final String RESOLVED = "resolved";

  Promise always(Function... o);

  Promise done(Function... o);

  Promise fail(Function... o);

  Promise pipe(Function... f);

  Promise progress(Function... o);

  String state();

  Promise then(Function... f);

}