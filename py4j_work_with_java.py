# coding:utf-8
# 需先啟動 Java Gateway Server

from py4j.java_gateway import JavaGateway
gateway = JavaGateway()							# connect to the JVM

# 單純使用 Java 的方法
random = gateway.jvm.java.util.Random()			# create a java.util.Random instance
number1 = random.nextInt(10)					# call the Random.nextInt method
number2 = random.nextInt(10)
print(number1,number2)

# 調用 Java 副程式內的方法
addition_app = gateway.entry_point				# get the AdditionApplication instance
addition_app.addition(number1,number2)			# call the addition method
