package dev.vansen.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to mark a class or a method as highly tested.
 * <p>
 * Indicates that the class or method is highly recommended to be used, and should work perfectly fine.
 *
 * @see Tested
 * @see NotTested
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface HighlyTested {
}