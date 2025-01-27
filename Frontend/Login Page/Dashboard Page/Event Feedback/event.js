// JavaScript to toggle the visibility of options
function toggleOptions() {
    const options = document.getElementById('options');
    options.classList.toggle('show');
}

// Function to handle event selection
function selectEvent(event) {
    console.log("Selected Event: " + event);
    document.getElementById('selectedEvent').innerText = event; // Display selected event
    document.getElementById('feedbackForm').style.display = 'block'; // Show feedback form
    toggleOptions(); // Hide dropdown options
}

// Function to submit feedback
function submitFeedback() {
    const satisfaction = document.querySelector('input[name="satisfaction"]:checked');
    const expectations = document.querySelector('input[name="expectations"]:checked');
    const likeMost = document.getElementById('likeMost').value;
    const likeLeast = document.getElementById('likeLeast').value;
    const recommend = document.querySelector('input[name="recommend"]:checked');
    const venueSatisfaction = document.querySelector('input[name="venueSatisfaction"]:checked');
    const improvement = document.getElementById('improvement').value;

    console.log("Feedback submitted for " + document.getElementById('selectedEvent').innerText + ":");
    console.log("Overall satisfaction: " + (satisfaction ? satisfaction.value : "Not rated"));
    console.log("Expectations met: " + (expectations ? expectations.value : "Not answered"));
    console.log("What did you like most: " + likeMost);
    console.log("What did you like least: " + likeLeast);
    console.log("Would you recommend: " + (recommend ? recommend.value : "Not answered"));
    console.log("Venue satisfaction: " + (venueSatisfaction ? venueSatisfaction.value : "Not rated"));
    console.log("Improvement suggestions: " + improvement);

    alert("Thank you for your feedback!"); // Confirmation message
    document.getElementById('likeMost').value = ''; // Clear the input
    document.getElementById('likeLeast').value = ''; // Clear the input
    document.getElementById('improvement').value = ''; // Clear the improvement textarea
    document.getElementById('feedbackForm').style.display = 'none'; // Hide feedback form
}