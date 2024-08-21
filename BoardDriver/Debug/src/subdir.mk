################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/Analog.cpp \
../src/BoardDriver.cpp \
../src/Comms.cpp \
../src/Config.cpp \
../src/Deconfig.cpp \
../src/Digital.cpp \
../src/Dump.cpp \
../src/Executor.cpp \
../src/Interrupt.cpp \
../src/LineByte.cpp \
../src/Notify.cpp \
../src/PinConfigurer.cpp \
../src/Read.cpp \
../src/Write.cpp 

CPP_DEPS += \
./src/Analog.d \
./src/BoardDriver.d \
./src/Comms.d \
./src/Config.d \
./src/Deconfig.d \
./src/Digital.d \
./src/Dump.d \
./src/Executor.d \
./src/Interrupt.d \
./src/LineByte.d \
./src/Notify.d \
./src/PinConfigurer.d \
./src/Read.d \
./src/Write.d 

OBJS += \
./src/Analog.o \
./src/BoardDriver.o \
./src/Comms.o \
./src/Config.o \
./src/Deconfig.o \
./src/Digital.o \
./src/Dump.o \
./src/Executor.o \
./src/Interrupt.o \
./src/LineByte.o \
./src/Notify.o \
./src/PinConfigurer.o \
./src/Read.o \
./src/Write.o 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.cpp src/subdir.mk
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -std=c++11 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$@" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


clean: clean-src

clean-src:
	-$(RM) ./src/Analog.d ./src/Analog.o ./src/BoardDriver.d ./src/BoardDriver.o ./src/Comms.d ./src/Comms.o ./src/Config.d ./src/Config.o ./src/Deconfig.d ./src/Deconfig.o ./src/Digital.d ./src/Digital.o ./src/Dump.d ./src/Dump.o ./src/Executor.d ./src/Executor.o ./src/Interrupt.d ./src/Interrupt.o ./src/LineByte.d ./src/LineByte.o ./src/Notify.d ./src/Notify.o ./src/PinConfigurer.d ./src/PinConfigurer.o ./src/Read.d ./src/Read.o ./src/Write.d ./src/Write.o

.PHONY: clean-src

