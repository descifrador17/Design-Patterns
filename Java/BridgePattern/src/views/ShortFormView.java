package views;

import resources.IResource;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 09:04 PM
 */
public class ShortFormView extends View{
    public ShortFormView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {
        System.out.println("--------Short Form View Show()--------");
        //Works on the resource present in the Parent View and return the result
        //Example - return this.resource.Title
        System.out.println("Title - "+resource.title());
        System.out.println("Image - "+resource.image());
        System.out.println();
        return null;
    }
}
