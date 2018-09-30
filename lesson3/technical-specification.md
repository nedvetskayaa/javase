# Variables, data types and operators
1. Типы данных и переменные:
    - базовые типы
	- ссылочные типы
	- объявление переменных
	- использование суффиксов
	- символы и строки
	- константы
2. Преобразования базовых типов данных:
    - потеря данных при преобразовании
	- усечение рациональных чисел до целых
	- преобразования при операциях
3. Операции языка Java:
	- арифметические операции
	- логические операции над числами
	- операции сдвига
	- операции сравнения
	- операции присваивания
	- приоритет операций

## Theory
- [Data types](https://github.com/rakavets/javase/wiki/Data-types)
- [Variables](https://github.com/rakavets/javase/wiki/Variables)
- [Arithmetic operations](https://github.com/rakavets/javase/wiki/Arithmetic-operations)
- [Comparison operations](https://github.com/rakavets/javase/wiki/Comparison-operations)
- [Logical operations](https://github.com/rakavets/javase/wiki/Logical-operations)

## Statement of work 1
Написать модуль, который преобразует трехзначное число в его детальное описание.

### Input
Целое число `number`, где 99 < `number` < 1000

### Output
Строка в формате `Hundreds: ${h}. Dozens: ${d}. Units: ${u}.`


## Statement of work 2
Написать модуль, который переводит температуру в градусах по шкале Цельсия в соответствующее значение температуры по шкале:
- Фаренгейта
- Кельвина

> Для пересчета по шкале Фаренгейта необходимо исходное значение температуры умножить на 1,8 и к результату прибавить 32, а по шкале Кельвина абсолютное значение нуля соответствует 273,15 градуса по шкале Цельсия.

### Input
Вещественное число `temperatureInCelsius`, где -273,15 < `temperatureInCelsius` < 100

### Output
Строка в формате `Celsius ${c}° - Kelvin ${k}° - Fahrenheit ${f}°`


## Statement of work 3
Написать модуль, которая решает квадратное уравнения `y = a\*x^2 + b\*x + c`.
### Input
Вещественные числа `a`, `b`, `c`, `x`
### Output
Вещественное число


## Statement of work 4
Написать модуль, который определит растояние которое проехал робот. Известно показание эндкодера после поездки и радиус шин установленных на роботе. Показания энкодера сбрасывались в начале поездки.
> Энкодер — устройство, предназначенное для преобразования угла поворота вращающегося объекта (вала) в электрические сигналы, позволяющие определить угол его поворота.

### Input
Два целых числа `encoderDegrees` и `tireRadius`, где 0 < `encoderDegrees` и 0 < `tireRadius` < 100

### Output
Вещественное число


## Statement of work 5
Написать модуль который, который высчитывает время проведенное игроком в игре в формате `HH:mm:ss`, когда известно что игрок провел в игре `playingTimeInSeconds` секунд

### Input
Целое число `playingTimeInSeconds`, где 0 < `playingTimeInSeconds` < 86400

### Output
Строка в формате `HH:mm:ss`