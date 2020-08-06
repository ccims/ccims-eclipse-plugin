# CCIMS Eclipse Plugin Api Bindings
Generated java bindings for the ccims graphql api.

## Submodule
The folder [`graphql_java_gen`](graphql_java_gen) is a git submodule with the actual generator code and some necessary java classes.

These java classes are copied to src-support during the generation.
The copyright and license notice for these files can be found at [src-support/LICENSE.txt](src-support/LICENSE.txt).

## Generating
### Preparations
Install `bash`, `ruby`, `gem` and `bundler`.
Install project dependencies by executing `bundle`.

### Running generation
For the generation we need the graphql intorspection json.
This can be genrated on https://tools.w3cub.com/graphql-to-introspection-json.
But the result from that website must be wrapped into `{ 'data':` at the start and `}` at the end.
The resulting json must be saved in `schema.json`.

Run `generate.sh` without any arguments
This will delete and create the neccesarry folders and generate the code.

### Manual fixing
Due to some problems in the generator, there are some minor bugs generated.
In some classes the class `com.shopify.graphql.support.Query` is imported but conflicts with the generated 
`de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Query`. This causes syntax errors.
In these cases just delete the import.

### Using nix
You can use `nix-shell` to perform the preparations and the generation by running:
`nix-shell --run "bash generate.sh"`
