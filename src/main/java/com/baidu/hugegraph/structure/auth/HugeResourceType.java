/*
 * Copyright 2017 HugeGraph Authors
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.baidu.hugegraph.structure.auth;

public enum HugeResourceType {

    NONE,

    STATUS,

    VERTEX,

    EDGE,

    VERTEX_AGGR,

    EDGE_AGGR,

    VAR,

    GREMLIN,

    TASK,

    PROPERTY_KEY,

    VERTEX_LABEL,

    EDGE_LABEL,

    INDEX_LABEL, // include create/rebuild/delete index

    SCHEMA,

    META,

    GRANT,

    USER,

    ALL;

    public boolean isGraph() {
        int ord = this.ordinal();
        return VERTEX.ordinal() <= ord && ord <= EDGE.ordinal();
    }

    public boolean isSchema() {
        int ord = this.ordinal();
        return PROPERTY_KEY.ordinal() <= ord && ord <= SCHEMA.ordinal();
    }

    public boolean isAuth() {
        int ord = this.ordinal();
        return GRANT.ordinal() <= ord && ord <= USER.ordinal();
    }

    public boolean isGrantOrUser() {
        return this == GRANT || this == USER;
    }

    public boolean isRepresentative() {
        return this == ALL || this == SCHEMA;
    }
}
