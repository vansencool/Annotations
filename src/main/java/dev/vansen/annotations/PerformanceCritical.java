package dev.vansen.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method as critical for performance
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface PerformanceCritical {
}
