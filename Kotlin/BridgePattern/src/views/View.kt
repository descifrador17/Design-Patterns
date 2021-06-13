package views

import resources.IResource

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:44 PM
 *
 */
abstract class View(private val resource:IResource) {

    abstract fun show(): String
}