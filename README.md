# Besom with sbt

## Prerequisites

- [Pulumi](https://www.pulumi.com/docs/get-started/install/)

It is also possible to install with homebrew:

```shell
brew install pulumi
```

setup the pulumi local backend:

```shell
pulumi login --local
```

set env vars:

```shell
export PULUMI_CONFIG_PASSPHRASE_FILE=
export PULUMI_CONFIG_PASSPHRASE=
```

inititialize a stack:

```shell
pulumi stack init dev
```


## Usage

To deploy the infrastructure, run:

```shell
BESOM_SBT_MODULE=infra pulumi up -y --stack dev
```

Output should be:

```shell
Previewing update (dev):
@ previewing update..................

@ previewing update.................
    pulumi:pulumi:Stack test-app-dev  warning: infra.Main.run:9  Nothing's here yet, it's waiting for you to write some code!
 +  pulumi:pulumi:Stack test-app-dev create warning: infra.Main.run:9  Nothing's here yet, it's waiting for you to write some code!
@ previewing update....
 +  pulumi:pulumi:Stack test-app-dev create 1 warning
Diagnostics:
  pulumi:pulumi:Stack (test-app-dev):
    warning: infra.Main.run:9  Nothing's here yet, it's waiting for you to write some code!

Resources:
    + 1 to create

Updating (dev):
@ updating..................

@ updating................
 +  pulumi:pulumi:Stack test-app-dev creating (0s) 
 +  pulumi:pulumi:Stack test-app-dev creating (0s) warning: infra.Main.run:9  Nothing's here yet, it's waiting for you to write some code!
@ updating....
 +  pulumi:pulumi:Stack test-app-dev created (0.48s) 1 warning
Diagnostics:
  pulumi:pulumi:Stack (test-app-dev):
    warning: infra.Main.run:9  Nothing's here yet, it's waiting for you to write some code!

Resources:
    + 1 created

Duration: 15s
```
