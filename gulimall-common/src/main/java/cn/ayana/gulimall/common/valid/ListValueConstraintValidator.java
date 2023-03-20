package cn.ayana.gulimall.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {

    private Set<Integer> set=new HashSet<>();

    //初始化方法，可以获取注解参数信息
    @Override
    public void initialize(ListValue constraintAnnotation) {
//        ConstraintValidator.super.initialize(constraintAnnotation);
        int[] vals=constraintAnnotation.vals(); //获取vals参数
        for (int val : vals) {
            set.add(val);
        }
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {

        if (integer == null) {
            return true;
        }
        return set.contains(integer);
    }
}
