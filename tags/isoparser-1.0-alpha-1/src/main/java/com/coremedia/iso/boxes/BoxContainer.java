/*  
 * Copyright 2008 CoreMedia AG, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.coremedia.iso.boxes;

/**
 * Interface for all ISO boxes that may contain other boxes.
 */
public interface BoxContainer extends BoxInterface {

  /**
   * Gets all child boxes. May not return <code>null</code>.
   *
   * @return an array of boxes, empty array in case of no children.
   */
  Box[] getBoxes();

  /**
   * Gets all child boxes of the given type. May not return <code>null</code>.
   *
   * @param clazz child box's type
   * @return an array of boxes, empty array in case of no children.
   */
  <T extends Box> T[] getBoxes(Class<T> clazz);

  /**
   * Gets the parent box. May be <code>null</code> in case of the
   * {@link com.coremedia.iso.IsoFile} itself.
   *
   * @return a <code>BoxContainer</code> that contains <code>this</code>
   */
  BoxContainer getParent();

  /**
   * Returns the number of bytes from the start of the box to start of the first child.
   *
   * @return offset of first child from box start
   */
  long getNumOfBytesToFirstChild();
}
