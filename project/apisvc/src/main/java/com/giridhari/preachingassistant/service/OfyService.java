package com.giridhari.preachingassistant.service;

import com.giridhari.preachingassistant.models.BhaktiVrksha;
import com.giridhari.preachingassistant.models.Circle;
import com.giridhari.preachingassistant.models.Devotee;
import com.giridhari.preachingassistant.models.MahaCircle;
import com.giridhari.preachingassistant.models.Sector;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

/**
 * Custom Objectify Service that this application should use.
 */
public class OfyService {
    /**
     * This static block ensure the entity registration.
     */
    static {
        factory().register(Devotee.class);
        factory().register(BhaktiVrksha.class);
        factory().register(Sector.class);
        factory().register(Circle.class);
        factory().register(MahaCircle.class);     
    }

    /**
     * Use this static method for getting the Objectify service object in order to make sure the
     * above static block is executed before using Objectify.
     * @return Objectify service object.
     */
    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    /**
     * Use this static method for getting the Objectify service factory.
     * @return ObjectifyFactory.
     */
    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}