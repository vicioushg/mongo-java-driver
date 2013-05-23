/*
 * Copyright (c) 2008 - 2013 10gen, Inc. <http://10gen.com>
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
 *
 */

package org.mongodb.connection;

/**
 * A logical connection to a MongoDB server that supports clustering along with other servers.
 */
public interface ClusterableServer extends Server {
    /**
     * Adds a change listener to this server.
     *
     * @param changeListener the listener for change events to the description of this server
     */
    void addChangeListener(ChangeListener<ServerDescription> changeListener);

    /**
     * Invalidate the description of this server.  Implementation of this method should not block,
     * but rather trigger an asynchronous attempt to connect with the server in order to determine its current status.
     */
    void invalidate();

}
