
Задание:
Создать простую система учета животных
Каждое животное имеет набор свойств, например:
ВЕС, РОСТ, ТИП

Каждое свойство имеет набор параметров, например:
ВЕС -> ЛЕГКОЕ, СРЕДНЕЕ, ТЯЖЕЛОЕ
РОСТ -> МАЛЕНЬКОЕ, НЕВЫСОКОЕ, ВЫСОКОЕ
ТИП -> ТРАВОЯДНОЕ, ПЛОТОЯДНОЕ, ВСЕЯДНОЕ

В качестве входной информации – перечень животных с указанием их свойств, допустим:
ЛЕГКОЕ,МАЛЕНЬКОЕ,ВСЕЯДНОЕ
ТЯЖЕЛОЕ,МАЛЕНЬКОЕ,ТРАВОЯДНОЕ
ТЯЖЕЛОЕ,НЕВЫСОКОЕ,ТРАВОЯДНОЕ и т.д.

Нужно разработать систему правил для ПО, чтобы посчитать по входным данным, и выдать результат на экран:
1. Сколько животных – травоядных
2. Сколько животных – травоядных или плотоядных и они при этом маленькие
3. Сколько животных – всеядных, но не являются высокими

Программа не должна предполагать ручного ввода данных. Все данные брать из внешних источниках (напр. файлы). 

Программа не должна содержать внутри никаких констант, связанных со свойствами животных или теми наборами параметров, которыми обладают

Программа не должна содержать логику для расчета по входным данным. Логика расчетов должна определяться перечнем правил, взятыми из внешнего источника (напр. файла).
Программа должна только исполнять эти правила. Набор поддерживаемых правил, можно ограничить только теми, которые необходимы для  вычислений.

Покрыть основную логику работы unit test'ами.

Все форматы и способы задания данных на усмотрение разработчика. Программа не должна содержать лишнего функционала.
Т.е. если она что-то делает дополнительно, но этого делать не просили, если это привело к дополнительным трудозатратам

Программа должна быть написана с учетом того, что потом потребуется поддержка. С учетом возможности коллективной разработки.
Максимально читабельно и прозрачно. Приветствуется знание и применение паттернов программирования

Update:
Избавится от наследования Rule от Aminal (+)

Оптимизировать алгоритм в классе Logic -  зачем хранить в памяти всех животных?? (+)

Для подсчета животных по 3м правилам надо 3 раза запустить программу что не есть хорошо , хотелось бы получить результат при однократном запуске программы.(+)

хотелка : Правило может содержать и 4+ поля как и животное, можно сделать динамическую загрузку параметров? (-)

хотелка : Можно избавиться от ввода в консоле ( через проперти какой нить задать папки) (+)

хотелка : Можно сделать чтение из директории всех файлов? для прогонки(+)