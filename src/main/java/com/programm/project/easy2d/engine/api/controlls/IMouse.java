package com.programm.project.easy2d.engine.api.controlls;

import com.programm.project.easy2d.engine.api.Subscription;

public interface IMouse {

    float x();
    float y();

    boolean leftPressed();
    boolean midPressed();
    boolean rightPressed();

    Subscription onMousePressed(IMouseListener listener);
    Subscription onMouseReleased(IMouseListener listener);

    Subscription onMouseMoved(IMouseMoveListener listener);
    Subscription onMouseDragged(IMouseDragListener listener);

    Subscription onMouseScrolled(IMouseScrollListener listener);

}
