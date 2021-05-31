package command

/**
 *
 *   Author: Utkarsh Dayal @ descifrador17
 *   Date: 31-05-2021
 *   Time: 05:02 AM
 *
 */
interface ICommand {
    fun doAction();

    fun undoAction();
}