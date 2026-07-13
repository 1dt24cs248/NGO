# Contributing to NGO Project

Thank you for contributing to the NGO Project!

Please follow the steps below to contribute successfully.

---

# Prerequisites

## Install Git

https://git-scm.com/downloads

Verify installation:

```bash
git --version
```

---

# Step 1: Configure Git (First Time Only)

Set your GitHub username:

```bash
git config --global user.name "Your Name"
```

Set your GitHub email:

```bash
git config --global user.email "your-email@example.com"
```

Verify configuration:

```bash
git config --global --list
```

Check username:

```bash
git config --global user.name
```

Check email:

```bash
git config --global user.email
```

---

# Step 2: Clone the Repository

```bash
git clone https://github.com/1dt24cs248/NGO.git
```

---

# Step 3: Move into Project Folder

```bash
cd NGO
```

---

# Step 4: Check Current Branch

```bash
git branch
```

Expected output:

```text
* main
```

---

# Step 5: Check Repository Status

```bash
git status
```

---

# Step 6: Download the Latest Changes

Always update your local repository before starting work.

```bash
git pull origin main
```

or

```bash
git pull --rebase origin main
```

---

# Step 7: Create a New Branch

Create a separate branch for every feature or bug fix.

```bash
git checkout -b feature-name
```

Example:

```bash
git checkout -b donation-page
```

---

# Step 8: Switch Branches

Using checkout:

```bash
git checkout main
```

Using switch (recommended):

```bash
git switch main
```

---

# Step 9: Make Changes

Edit the required project files.

Example:

* index.html
* apply.html
* theme.css

Save all changes.

---

# Step 10: Check Modified Files

```bash
git status
```

---

# Step 11: Add Changes

Add all files:

```bash
git add .
```

Add a specific file:

```bash
git add apply.html
```

---

# Step 12: Commit Changes

```bash
git commit -m "Added apply page"
```

Example:

```bash
git commit -m "Updated donation page"
```

Write meaningful commit messages that clearly describe your changes.

---

# Step 13: Push Your Branch

```bash
git push origin feature-name
```

Example:

```bash
git push origin donation-page
```

---

# Step 14: Create a Pull Request

Go to GitHub.

Open the repository.

Click:

```text
Compare & Pull Request
```

↓

Click:

```text
Create Pull Request
```

↓

Add a title and description.

↓

Click:

```text
Create Pull Request
```

---

# Step 15: Pull Request Review & Merge

The repository owner or maintainer reviews your Pull Request.

If approved:

```text
Merge Pull Request
```

↓

```text
Confirm Merge
```

---

# Step 16: Delete Branch

Delete local branch:

```bash
git branch -d feature-name
```

Delete remote branch:

```bash
git push origin --delete feature-name
```

---

# Step 17: Update Main Branch

```bash
git checkout main
```

```bash
git pull origin main
```

---

# Step 18: View Commit History

Complete history:

```bash
git log
```

Short history:

```bash
git log --oneline
```

Graph view:

```bash
git log --graph --decorate --all
```

---

# Step 19: View File Changes

```bash
git diff
```

---

# Step 20: View Remote Repository

```bash
git remote -v
```

---

# Step 21: Add Remote

**Note:** Skip this step if you cloned the repository using `git clone`, as the `origin` remote is already configured.

```bash
git remote add origin https://github.com/1dt24cs248/NGO.git
```

---

# Step 22: Change Remote URL

```bash
git remote set-url origin https://github.com/1dt24cs248/NGO.git
```

---

# Step 23: Remove Remote

```bash
git remote remove origin
```

