/*
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.dev.jjs.impl.gflow.cfg;

import com.google.gwt.dev.jjs.ast.JThrowStatement;

/**
 * Node corresponding to throw statement.
 */
public class CfgThrowNode extends CfgNode<JThrowStatement> {
  public CfgThrowNode(CfgNode<?> parent, JThrowStatement node) {
    super(parent, node);
  }

  @Override
  public void accept(CfgVisitor visitor) {
    visitor.visitThrowNode(this);
  }

  @Override
  public String toDebugString() {
    return "THROW";
  }

  @Override
  protected CfgNode<?> cloneImpl() {
    return new CfgThrowNode(getParent(), getJNode());
  }
}
