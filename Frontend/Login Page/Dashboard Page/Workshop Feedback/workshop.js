// JavaScript to toggle the visibility of options
function toggleOptions() {
    const options = document.getElementById('options');
    options.classList.toggle('show');
}

// Function to handle workshop selection
function selectWorkshop(workshop) {
    console.log("Selected Workshop: " + workshop);
    document.getElementById('selectedWorkshop').innerText = workshop; // Display selected workshop
    document.getElementById('feedbackForm').style.display = 'block'; // Show feedback form
    toggleOptions(); // Hide dropdown options
}

// Function to submit feedback
function submitFeedback() {
    const likeMost = document.getElementById('likeMost').value;
    const likeLeast = document.getElementById('likeLeast').value;
    const feedback = document.getElementById('feedback').value;
    const rating = document.querySelector('input[name="rating"]:checked');
    const materialRelevant = document.querySelector('input[name="materialRelevant"]:checked');
    const learningObjectives = document.querySelector('input[name="learningObjectives"]:checked');
    const teachingMethods = document.querySelector('input[name="teachingMethods"]:checked');
    const workshopPace = document.querySelector('input[name="workshopPace"]:checked');

    console.log("Feedback submitted for " + document.getElementById('selectedWorkshop').innerText + ":");
    console.log("What did you like most: " + likeMost);
    console.log("What did you like least: " + likeLeast);
    console.log("Overall rating: " + (rating ? rating.value : "Not rated"));
    console.log("Material relevant: " + (materialRelevant ? materialRelevant.value : "Not answered"));
    console.log("Learning objectives clear: " + (learningObjectives ? learningObjectives.value : "Not answered"));
    console.log("Teaching methods effective: " + (teachingMethods ? teachingMethods.value : "Not answered"));
    console.log("Workshop pace appropriate: " + (workshopPace ? workshopPace.value : "Not answered"));
    console.log("Additional feedback: " + feedback);

    alert("Thank you for your feedback!"); // Confirmation message
    document.getElementById('likeMost').value = ''; // Clear the input
    document.getElementById('likeLeast').value = ''; // Clear the input
    document.getElementById('feedback').value = ''; // Clear the feedback textarea
    document.getElementById('feedbackForm').style.display = 'none'; // Hide feedback form
}