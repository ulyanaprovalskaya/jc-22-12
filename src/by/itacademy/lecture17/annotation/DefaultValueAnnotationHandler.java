package by.itacademy.lecture17.annotation;

import java.lang.reflect.Field;
import java.util.Arrays;

public class DefaultValueAnnotationHandler {

    public <T> void handle(T object) {
        Class<?> classVar = object.getClass();
        Field[] fields = classVar.getDeclaredFields();

        Arrays.stream(fields)
              .forEach(field -> {
                  if (field.isAnnotationPresent(DefaultValue.class)) {
                      try {
                          field.setAccessible(true);
                          Object fieldValue = field.get(object);
                          if (fieldValue == null) {
                              DefaultValue annotation = field.getAnnotation(DefaultValue.class);
                              field.set(object, annotation.value());
                          }
                      } catch (IllegalAccessException e) {
                          e.printStackTrace();
                      }
                  }
              });
    }
}
