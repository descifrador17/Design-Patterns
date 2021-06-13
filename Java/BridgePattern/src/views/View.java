package views;

import resources.IResource;

/**
 * Author: Utkarsh Dayal @ descifrador17
 * Date: 13-06-2021
 * Time: 07:28 PM
 */
abstract class View {

    IResource resource;

    public View(IResource resource) {
        this.resource = resource;
    }

    public abstract String show();
}
