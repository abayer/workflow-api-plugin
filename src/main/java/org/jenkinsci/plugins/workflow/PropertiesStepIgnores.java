package org.jenkinsci.plugins.workflow;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Used on {@link hudson.model.JobPropertyDescriptor} to mark that the {@code properties} step will ignore them.
 */
@Retention(SOURCE)
@Target(TYPE)
@Inherited
public @interface PropertiesStepIgnores {
}
