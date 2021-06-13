package views;

import resources.IResource;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 07:53 PM
 */
public class LongFormView extends View{
    public LongFormView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        System.out.println("--------Long Form View Show()--------");
        //Works on the resource present in the Parent View and return the result
        //Example - return this.resource.snippet
        System.out.println("Title - "+resource.title());
        System.out.println("Image - "+resource.image());
        System.out.println("Url - "+resource.url());
        System.out.println("Snippet - "+resource.snippet());
        System.out.println();
        return null;
    }
}
