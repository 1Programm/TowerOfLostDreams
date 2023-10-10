package com.programm.project.easy2d.engine.api;

import com.programm.project.easy2d.engine.api.controlls.IKeyboard;
import com.programm.project.easy2d.engine.api.controlls.IMouse;
import com.programm.project.easy2d.engine.api.logging.ILogger;

public interface IContext {

    ILogger log();

    IWindow window();

    IMouse mouse();

    IKeyboard keyboard();

}
