package com.ynchuan.code.dynamicProxy;

import java.lang.reflect.Method;

public interface InvocationHandler {
  void invoke(Object o,Method m);
}
