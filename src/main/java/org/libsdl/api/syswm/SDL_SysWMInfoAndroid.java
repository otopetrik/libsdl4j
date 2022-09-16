package org.libsdl.api.syswm;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({
        "window",
        "surface"
})
public final class SDL_SysWMInfoAndroid extends Structure {

    public Pointer window;
    public Pointer surface;

    public SDL_SysWMInfoAndroid() {
    }

    public SDL_SysWMInfoAndroid(Pointer p) {
        super(p);
    }
}
