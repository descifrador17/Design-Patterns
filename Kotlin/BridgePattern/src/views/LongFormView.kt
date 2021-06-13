package views

import resources.IResource

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:45 PM
 *
 */
class LongFormView(private val resource: IResource) : View(resource) {
    override fun show(): String {
        println("--------Long Form View Show()--------")
        //Works on the resource present in the Parent View and return the result
        //Example - return this.resource.snippet
        //Works on the resource present in the Parent View and return the result
        //Example - return this.resource.snippet
        println("Title - " + resource.title())
        println("Image - " + resource.image())
        println("Url - " + resource.url())
        println("Snippet - " + resource.snippet())
        println()
        return ""
    }
}