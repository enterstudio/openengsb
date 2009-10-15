/**

   Copyright 2009 OpenEngSB Division, Vienna University of Technology

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
 */

package org.openengsb.edb.core.repository;

/**
 * Error thrown in the case that any error occurs during the management of the
 * repositories. E.g. creation or deletion of a git repository.
 */
public class RepositoryManagementException extends Error {

    public RepositoryManagementException() {
    }

    public RepositoryManagementException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepositoryManagementException(String message) {
        super(message);
    }

    public RepositoryManagementException(Throwable cause) {
        super(cause);
    }

}
