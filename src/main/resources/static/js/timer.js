// timer
//let timerInput = document.getElementById("time"); // Берём строку
let buttonRun = document.getElementById("test-btn-start");// Берём кнопку запуска
let timerShow = document.getElementById("timer"); // Берём блок для показа времени

var timeMinut = 1800;

//buttonRun.addEventListener('click', function() {
  //timeMinut = parseInt(timerInput.value) * 60;
//})

timer = setInterval(function () {
    seconds = timeMinut%60 // Получаем секунды
    minutes = timeMinut/60%60 // Получаем минуты
    hour = timeMinut/60/60%60 // Получаем часы
    // Условие если время закончилось то...
    if (timeMinut <= 0) {
        // Таймер удаляется
        clearInterval(timer);
        // Выводит сообщение что время закончилось
        alert("Время закончилось");
    } else { // Иначе
        // Создаём строку с выводом времени
        let strTimer = `${Math.trunc(hour)}:${Math.trunc(minutes)}:${seconds}`;
        // Выводим строку в блок для показа таймера
        timerShow.innerHTML = strTimer;
    }
    --timeMinut; // Уменьшаем таймер
}, 1000)
