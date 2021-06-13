package resources

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 13-06-2021
 *   Time: 09:33 PM
 *
 */
interface IResource {
    fun snippet(): String
    fun title(): String
    fun image(): String
    fun url(): String
}