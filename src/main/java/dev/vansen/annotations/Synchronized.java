package dev.vansen.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method as synchronized, indicating that it should only be accessible by one thread at a time.
 * <p>
 * This annotation serves as a reminder to implement proper synchronization mechanisms around the method's execution.
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Synchronized {
}
