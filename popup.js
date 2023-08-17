const openPopupButton = document.getElementById("openPopupButton");
const closePopupButton = document.getElementById("closePopupButton");
const popup = document.getElementById("popup");

openPopupButton.addEventListener("click", function() {
  popup.style.display = "block";
});

closePopupButton.addEventListener("click", function() {
  popup.style.display = "none";
});
