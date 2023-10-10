package com.programm.project.easy2d.engine.api;

import com.programm.project.easy2d.engine.api.logging.ILogger;

public interface IEngine {

    void setEngineOut(ILogger logger);

    void update();

    void render(IPencil pencil);

}
