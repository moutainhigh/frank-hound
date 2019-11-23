package com.hbfintech.hound.core.event;

import com.hbfintech.hound.core.support.EventObject;
import com.hbfintech.hound.core.support.Hound;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author frank
 */
public abstract class HoundEvent extends EventObject
{
    @Getter
    private final String[] args;

    public HoundEvent(Object source)
    {
        super(source);
        this.args = null;
    }

    public HoundEvent(@NonNull Hound source,String[] args)
    {
        super(source);
        this.args = args;
    }

    public Hound getHoundShepherd() {
        return (Hound) getSource();
    }
}
