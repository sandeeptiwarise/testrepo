package com.nucleus.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
    String message() default "{Phone number required in valid format. Please fill in.}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
