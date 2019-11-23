package com.hbfintech.hound.core.event;

import com.hbfintech.hound.core.support.Hound;

/**
 * @author frank
 */
public class SortedEvent extends HoundEvent
{
    /**
     * Used to listen for processed events for {@link com.hbfintech.hound.core.acceptor.sorter.Sorter}
     * @param source Hound instance that publish event
     */
    public SortedEvent(
            Hound source)
    {
        super(source);
    }
}