package dev.vansen.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to mark a class or a method as not tested.
 * It is not recommended to use the class or method as it may not work as expected.
 *
 * @see Tested
 * @see HighlyTested
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface NotTested {
}