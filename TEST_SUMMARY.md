# Muze Beta Exploratory Testing – Test Summary

## Testing Approach

I performed exploratory testing on the Muze beta platform to understand the real user experience and application behavior.  
To better understand expected social media workflows and UI behavior, I also explored similar social media platforms for comparison.

The testing mainly focused on:
- Chatting / Messaging
- Post Upload
- User Profile
- Community Creation

Testing was performed on desktop browser view.

---

# Bug Report Links

## Bug Tracking Sheet
[Bug Report Spreadsheet](https://docs.google.com/spreadsheets/d/15LWaUwhMNKbjFkUZ-pkUJvAI_svHfis3mrhyA780KvE/edit?usp=sharing&utm_source=chatgpt.com)

---

# Test Case Links

## Executed Test Cases
[Test Case Spreadsheet](https://docs.google.com/spreadsheets/d/1tWV9u2bahr_g12te9R1f1g7SAhVylk6KjAO__9TerX8/edit?usp=sharing&utm_source=chatgpt.com)

---

# Testing Summary

## Bugs Identified

During exploratory testing, I identified multiple issues with different severity levels.

### Severity Breakdown
- High Severity Bugs: 4
- Critical Bugs: 2
- Medium Severity Bugs: 2

### Additional Blocker Observation
One issue behaved like a blocker during testing.

---

# Blocker Observation

## Premium Subscription Purchase Flow

When a logged-in user tried to create a new community, the application required a premium subscription.

However:
- No purchase button was available
- No upgrade/payment page opened
- User was unable to purchase the subscription

Because of this, the user could not continue the community creation flow.

I assumed this functionality may still be under development in the beta version.

---

# Areas Tested

The following modules/features were tested:

- User Login & Logout
- Chat / Messaging Flow
- Post Upload
- User Profile
- Community Creation
- Basic Navigation
- Session Handling

Detailed execution results are available in the shared test case document.

---

# Automation Code Link

Automation framework repository:

(Add your GitHub repository link here)

Example:
https://github.com/your-username/muze-test-automation

---

# Observations

## What Worked Well
- UI design felt modern and user friendly
- Navigation between screens was not smoothly
- Basic posting and profile flows were easy to understand
- Chat functionality was responsive in most scenarios

---

## Risky / Bug-Prone Areas

### Chat & Messaging
- Session handling issues after logout/login
- Previous chat visibility inconsistencies
- Input state handling issues

### Community Creation Flow
- Premium subscription dependency blocks user flow
- Missing upgrade/payment handling

### User Profile & Feed
- Possible media rendering inconsistencies
- Profile data synchronization risks

### Post Upload
- Media upload validation and handling require more testing
- Edge cases around unsupported media/files should be tested

---

# Suggestions for Future Test Coverage

Recommended additional testing areas:

- Real-time collaboration testing
- Canvas feature testing
- Mobile responsive testing
- Media stress testing
- API testing
- Security & permission testing
- Performance testing
- Cross-browser testing

---

# Blockers Faced

- Some features appeared partially implemented
- Premium subscription flow was incomplete
- Expected behavior was unclear in some beta-stage scenarios

---
