/*
 *
 *
 *
 *
 * Scaloid: Simpler Android
 *
 * http://scaloid.org
 *
 *
 *
 *
 *
 *
 * Copyright 2013 Sung-Ho Lee and Scaloid contributors
 *
 * Sung-Ho Lee and Scaloid contributors licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/*
 * This file is automatically generated. Any changes on this file will be OVERWRITTEN!
 * To learn how to contribute, please refer to:
 * https://github.com/pocorall/scaloid/wiki/Inside-Scaloid
 */

package org.scaloid.support.v4

import scala.language.implicitConversions

trait AppImplicits {
  @inline implicit def fragment2RichFragment[V <: android.support.v4.app.Fragment](fragment: V) = new RichFragment[V](fragment)
  @inline implicit def fragmentActivity2RichFragmentActivity[V <: android.support.v4.app.FragmentActivity](fragmentActivity: V) = new RichFragmentActivity[V](fragmentActivity)
  @inline implicit def fragmentManager2RichFragmentManager[V <: android.support.v4.app.FragmentManager](fragmentManager: V) = new RichFragmentManager[V](fragmentManager)
  @inline implicit def fragmentTransaction2RichFragmentTransaction[V <: android.support.v4.app.FragmentTransaction](fragmentTransaction: V) = new RichFragmentTransaction[V](fragmentTransaction)
  @inline implicit def listFragment2RichListFragment[V <: android.support.v4.app.ListFragment](listFragment: V) = new RichListFragment[V](listFragment)
  @inline implicit def dialogFragment2RichDialogFragment[V <: android.support.v4.app.DialogFragment](dialogFragment: V) = new RichDialogFragment[V](dialogFragment)

}
object AppImplicits extends AppImplicits

trait Implicits extends AppImplicits with ViewImplicits with WidgetImplicits
object Implicits extends Implicits
