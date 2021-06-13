package views

import resources.IResource

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:48 PM
 *
 */
class ShortFormView(private val resource:IResource) : View(resource) {
    override fun show(): String {
        println("--------Short Form View Show()--------")
        //Works on the resource present in the Parent View and return the result
        //Example - return this.resource.Title
        //Works on the resource present in the Parent View and return the result
        //Example - return this.resource.Title
        println("Title - " + resource.title())
        println("Image - " + resource.image())
        println()
        return ""
    }
}