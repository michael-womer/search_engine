# Search Engine
Author: *Michael Womer*
## Project Description

This is going to be a document search engine, with the goal of being able to type a command something like

```
search-engine search ./documents "united states"
```

into the terminal, and returning a list of matching documents alongside an excerpt of where that phrase appears in the document.

Some other  features I have in mind:

* AND / OR operator support
* Light TUI to create an interactive searching session
* Allow a few web sources, such as Google Drive folders
    * Could be implemented with a ``fetch`` command to get files locally first
    * Or be baked into the ``search`` command to download and search all in one go
* ``help`` command

## Stack

This is a Java project with Maven.  Any additional Maven plugins used will be listed here:

## Contribution

Please feel free to contribute :)
If you have any specific questions, you can reach out at ``mwomer27@gmail.com`` or ``michaelwomer.`` on Discord